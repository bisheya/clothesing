new Vue({
    el: '#file',
    data: {
        CommodityDo:{
            commodityName:"",
            commoditySize:"",
            commodityColor:"",
            commodityNum:0,
            commodityPrice:0,
            commodityDesc:"",
            commodityBrand:"",
        },
        formData:{},
    },
    methods: {
        /*获取图片路径，加上前缀否则不显示*/
        getImg:function(url) {
            if (url.indexOf("data:image/jpeg;base64") < 0) {
                return "data:image/jpeg;base64," + url
            }
            return url;
        },
        submitCommodity:function(){
            var that = this;
            $.ajax({
                url: '/commodity/insertCommodity',
                type: 'post',
                // 设置的是请求参数
                processData: false,
                contentType: false,
                data: this.formData,
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
                        alert("商品发布成功！");
                        that.reset();
                    }

                }
            })
        },
        reset:function(){
          this.CommodityDo = {};
          $("#myImg").attr("src", "../images/fileUp.png");
        },
        changImg:function(e) {
            var blobData;
            var that = this;
            for (var i = 0; i < e.target.files.length; i++) {
                var file = e.target.files.item(i);
                if (!(/^image\/.*$/i.test(file.type))) {
                    continue; //不是图片 就跳出这一次循环  
                }
                //实例化FileReader API  
                var freader = new FileReader();
                freader.readAsDataURL(file);
                var that = this;
                // console.log(this.getFileUrl(file));
                freader.onload = function (e) {
                    $("#myImg").attr("src", e.target.result);
                    console.log(that.getBob(e.target.result));
                    blobData = that.getBob(e.target.result);
                };
            }
            this.formData = new FormData();
            this.formData.append("file",file);
            this.formData.append("commodityName",this.CommodityDo.commodityName);
            this.formData.append("commoditySize",this.CommodityDo.commoditySize);
            this.formData.append("commodityColor",this.CommodityDo.commodityColor);
            this.formData.append("commodityNum",this.CommodityDo.commodityNum);
            this.formData.append("commodityPrice",this.CommodityDo.commodityPrice);
            this.formData.append("commodityDesc",this.CommodityDo.commodityDesc);
            this.formData.append("commodityBrand",this.CommodityDo.commodityBrand);



        },
        getBob:function(base64Data) {
            //console.log(base64Data);//data:image/png;base64,
            var byteString;
            if (base64Data.split(',')[0].indexOf('base64') >= 0)
                byteString = atob(base64Data.split(',')[1]);//base64 解码
            else {
                byteString = unescape(base64Data.split(',')[1]);
            }
            var mimeString = base64Data.split(',')[0].split(':')[1].split(';')[0];//mime类型 -- image/png

            // var arrayBuffer = new ArrayBuffer(byteString.length); //创建缓冲数组
            // var ia = new Uint8Array(arrayBuffer);//创建视图
            var ia = new Uint8Array(byteString.length);//创建视图
            for (var i = 0; i < byteString.length; i++) {
                ia[i] = byteString.charCodeAt(i);
            }
            var blob = new Blob([ia], {
                type: mimeString
            });
            return blob;

        },
    }
})



