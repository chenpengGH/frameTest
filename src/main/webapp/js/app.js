/**
 * Created by jhc on 2017/6/1.
 */
var app=angular.module('merchantApp',['ui.router']);
app.config(function($stateProvider,$urlRouterProvider){
    $urlRouterProvider.otherwise('/addUser');
    $stateProvider
        .state('addUser', {
            url: "/addUser",
            views: {
                'view': {
                    templateUrl: 'views/addUser.html',
                    controller: 'addUserCtr'
                }
            }
        });
}); 
