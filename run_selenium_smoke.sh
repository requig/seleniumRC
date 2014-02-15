export JENKINS_TOOL_DIR=`dirname $0`

rm -rf classes
mkdir classes
javac -d classes -cp .:classes:$JENKINS_TOOL_DIR/selenium-2.39.0/selenium-java-2.39.0.jar:$JENKINS_TOOL_DIR/junit-4.11.jar `find src -type f -name '*.java'`

ant --noconfig -v -DSELENIUM_HOME=$JENKINS_TOOL_DIR -f test.xml


