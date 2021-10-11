#!/bin/bash

set -euo pipefail

shutdown_on_error() {
    exit 1
}

trap shutdown_on_error INT TERM ERR

cd $ENV

PRS_DEV='https://catenaxdev001akssrv.germanywestcentral.cloudapp.azure.com/'
PRS_INT='https://catenaxintakssrv.germanywestcentral.cloudapp.azure.com/'

PRS_URL=$PRS_DEV

if [ $ENV == "int" ]
then
    PRS_URL=$PRS_INT
    echo $PRS_URL
fi

curl --location --request POST "$PRS_URL/brokerproxy/v0.1/PartRelationshipUpdateList" \
     --header 'Content-Type: application/json' \
     -d '@PartRelationshipUpdateList.json'

curl --location --request POST "$PRS_URL/brokerproxy/v0.1/PartAttributeUpdate" \
     --header 'Content-Type: application/json' \
     -d '@PartTypeNameUpdate.json'

curl --location --request POST "$PRS_URL/brokerproxy/v0.1/PartAspectUpdate" \
     --header 'Content-Type: application/json' \
      -d '@PartAspectUpdate.json'