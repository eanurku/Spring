1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -hibernate-validator

`    <properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.0.2.RELEASE</version>
        <relativePath/>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>5.0.3.Final</version>
        </dependency>
    </dependencies>
`

2. using angularjs to call external services.
`<!DOCTYPE html>
<html ng-app>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
</head>

<body>
<div ng-controller="Events">
    i have {{events.length}} events!!
    <ul>
        <li ng-repeat="event in events">{{event.eventName}}</li>
    </ul>
</div>

<script>
    function Events($scope, $http) {
        $http.get('http://localhost:8080/18_springmvc4_webapp_event_tracker_using_Angular_client_war/events.json')
            .success(function (data) {
                $scope.events = data;
                console.log(data);
            });
    }
</script>
</body>

</html>`

