<!DOCTYPE html>
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

</html>
