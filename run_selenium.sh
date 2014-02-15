export JENKINS_TOOL_DIR=`dirname $0`

##sleep 10

export DISPLAY=:0
java -jar $JENKINS_TOOL_DIR/selenium-server-standalone-2.39.0.jar -interactive > selenium.log 2>&1 &
selpid=$!

counter=0
timeout=90

grep 'type Selenium commands here' selenium.log >/dev/null

while [ $? -ne 0 -a $counter -lt $timeout ]
do

counter=`expr $counter + 1`
  sleep 1
  echo "Waiting for Selenium server $counter ..."
  grep 'type Selenium commands here' selenium.log >/dev/null

done
echo "Starting testing ..."

#Smoke tests
sleep 10


sh $JENKINS_TOOL_DIR/run_selenium_smoke.sh

kill -TERM $selpid
##kill -9 $Xpid
