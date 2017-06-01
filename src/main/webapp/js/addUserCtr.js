/**
 * Created by jhc on 2017/6/1.
 */
angular.module('merchantApp')
    .controller('addUserCtr', ['$scope', '$http', function ($scope, $http) {
        $scope.addUser = function (user) {
            //向后台提交数据
            $http.post("./addUser", user, {headers: 'Content-Type:application/json'}).success(function () {

            });
        }
    }])  
