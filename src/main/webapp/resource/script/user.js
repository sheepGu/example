//处理User登录注册的JS代码

var user={
    URL:{
        validate:function () {
            return "/exam/login/loginValidate"
        },
        main:function () {
            return "/exam/main/getIndex"
        }
    },
    HANDLEUSER:function (userName,passWord) {
        $.post(user.URL.validate(),{userName:userName,passWord:passWord},function (result) {
            if(result&&result['success']){
                //TODO
                user.jump();
            }else{
                $("#errorMessage").html(result['error']).show()
                setTimeout(user.messageHide,3000);
                $("#userName").val("");
                $("#password").val("");
            }
        });
    },
    jump:function () {
        location.href();
    },
    messageHide:function () {
        $("#errorMessage").hide();
    }

}