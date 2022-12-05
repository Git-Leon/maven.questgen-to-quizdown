SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"
jarFile=$SCRIPT_DIR/target/quizdown-generator-1.0.0.jar
java -cp $jarFile com.github.curriculeon.MainApplication $1