#!/bin/zsh

function testAddStudent {
  BODY=$(cat <<EOF
{
  "departmentName": "ComputerEngineering",
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

function testGetStudentsById {
  curl -X GET http://localhost:8082/departments/1 | jq
}

function testGetStudentsByName {
  curl -X GET http://localhost:8082/departments/name/computerengineering | jq
}

function testDeleteStudent {
  curl -X DELETE http://localhost:8082/departments/1
}

function testPutStudent {
BODY=$(cat <<EOF
{
  "departmentName": "Physics",
  "departmentAddress": "Dar es Salaam",
  "departmentCode": "P-123"
}
EOF
)
  curl -X PUT -H "Content-Type: application/json" -d "$BODY" http://localhost:8082/departments/1
}

###################################################################

testAddStudent
testGetStudentsByName
#testPutStudent
#testDeleteStudent
#testAddStudent
#testGetStudents
#testGetStudentsById
