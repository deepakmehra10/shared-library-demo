def call() {
    echo "Hi I was called"
    node {
        stage("Build") {
            sh "pwd"
        }
    }
}