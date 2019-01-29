node{
    stage('test1'){
        echo env.WORKSPACE
        echo "Hello world"
    }
    
    stage('test2'){
        echo "test2 got completed"
        sh('git tag -a v2.3.0')
        sh('git push --tags')
    }
}
