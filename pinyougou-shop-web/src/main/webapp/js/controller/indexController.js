app.controller("indexController", function ($scope,loginService) {

    //读取当前登录人
    $scope.showLoginName = function () {
        loginService.getName().success(
            function (response) {
                $scope.uername = response.loginName;
            })
    }
});