app.service("loginService", function ($http) {

    //获取登入名称
    this.getName = function () {
        return $http.get("/login/name.do");
    }
});