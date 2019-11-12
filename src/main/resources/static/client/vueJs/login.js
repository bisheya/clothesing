new Vue({
    el:"#login",
    data:{
        userName:"",
        passWord:"",
        user:{
            userContent:"",
            userName:"",
            userPass:"",
            userEmail:"",
            userSex:true,
            userPhone:"",
            userTradePass:"",
            userAuth:"user",
        }
    },
    methods: {
        login:function() {
            var queryParam = {
                "userName": this.userName,
                "userPass": this.passWord,
            };
            $.ajax({
                url: '/user/selectUser',
                type: 'post',
                // 设置的是请求参数
                contentType : 'application/json',
                data: JSON.stringify(queryParam),

                // 用于设置响应体的类型 注意 跟 data 参数没关系！！！
                dataType: 'json',
                success: function (res) {
                    // 一旦设置的 dataType 选项，就不再关心 服务端 响应的 Content-Type 了
                    // 客户端会主观认为服务端返回的就是 JSON 格式的字符串
                    console.log(res)
                    if(res.state==1){
                        alert(res.message);
                    }
                    else{
                        alert("登录成功！")
                        window.location.href = "./index";
                    }
                }
            })
        },
        change:function () {
            $("#toggle").children('i').toggleClass('fa-pencil');
            $('.form').animate({height: "toggle",'padding-top': 'toggle','padding-bottom': 'toggle',opacity: "toggle"}, "slow");
        },

        check:function(){
          if(this.user.userContent==""){
              return "用户名不能为空！";
          }
          else if(this.user.userName==""){
              return "昵称不能为空！";
          }
          else if(this.user.userPass==""){
              return "密码不能为空！";
          }
          else if(this.user.userEmail==""){
              return "邮箱不能为空！";
          }
          else if(this.user.userPhone==""){
              return "电话不能为空！";
          }
          else if(this.user.userTradePass==""){
              return "交易密码不能为空！";
          }
          else{
              return -1;
          }
        },
        register:function () {
            var result = this.check();
            if(result!=-1){
                alert(result);
                return ;
            }
            var that = this;
            $.ajax({
                url: '/user/insertUser',
                type: 'post',
                // 设置的是请求参数
                contentType : 'application/json',
                data: JSON.stringify(this.user),

                // 用于设置响应体的类型 注意 跟 data 参数没关系！！！
                dataType: 'json',
                success: function (res) {
                    // 一旦设置的 dataType 选项，就不再关心 服务端 响应的 Content-Type 了
                    // 客户端会主观认为服务端返回的就是 JSON 格式的字符串
                    console.log(res)
                    if(res.state==1){
                        alert(res.message);
                    }
                    else{
                        alert("注册成功！");
                        that.change();
                    }
                }
            })

        }

    }




})