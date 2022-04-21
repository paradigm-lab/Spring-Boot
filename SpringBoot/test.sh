#!/bin/zsh

function testAddStudent {
  BODY=$(cat <<EOF
{
  "departmentName": "Compute Engineering",
  "departmentAddress": "Tz",
  "departmentCode": "CE-0"
}
EOF
)
  curl -X POST -H "Content-Type: application/json" -d "$BODY" http://localhost:8082/departments
}

# | jq
function testGetStudents {
  curl -X GET http://localhost:8082/departments | jq
}


function testDeleteStudent {
  curl -X DELETE http://localhost:8080/api/v1/student/1
}

function testPutStudent {
  curl -X PUT http://localhost:8080/api/v1/student/5 -d name=Maria&email=maria@gmail.com
}

###################################################################

#testPutStudent
#testDeleteStudent
#testAddStudent
testGetStudents
