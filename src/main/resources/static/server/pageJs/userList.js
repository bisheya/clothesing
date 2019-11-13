new Vue({
    el: '#userList',
    data:{
        tableData:{},
        size:10,
        page:0,
        beginTime:null,
        endTime:null,
        userName:"",
        currentTotal:0,
        pageSize:5,
        currentPage:1,
    },
    methods:{
        getData:function(param){
            param.append('size', this.size);
            param.append('page', this.page);
            axios
                .post('/user/queryUser',param)
                .then(res => {
               this.tableData = res.data.data.list
            })
            .catch(function (error) { // 请求失败处理
                    console.log(error);
            });
        },
        check:function(){
           if((this.beginTime=="" || this.beginTime==null) && (this.endTime!="" && this.endTime!=null)){
               return "请输入正确的开始时间!";
           }
           else if((this.endTime=="" || this.endTime==null) && (this.beginTime!="" && this.beginTime!=null)){
               return "请输入正确的结束时间!";
           }
            else{
                return -1;
            }
        },
        queryButton:function(){
            var result = this.check();
            if(result!=-1){
                alert(result)
                return ;
            }
            var param = new URLSearchParams()
            if(this.beginTime!=null && this.endTime!=null){
                param.append('beginTime', this.beginTime);
                param.append('endTime', this.endTime);
            }

            if(this.userName != ""){
                param.append("userName",this.userName);
            }
            console.log(param);
            this.getData(param);

        },
        handleCurrentChange(curPage){
            this.currentPage = curPage;
            this.index = (this.currentPage - 1)*this.pageSize;
            var param = new URLSearchParams()
            if(this.beginTime!=null && this.endTime!=null){
                param.append('beginTime', this.beginTime);
                param.append('endTime', this.endTime);
            }

            if(this.userName != ""){
                param.append("userName",this.userName);
            }

            this.getData();

        }

    },
    created:function () {
        axios.defaults.withCredentials=true;
        var param = new URLSearchParams();

        this.getData(param);
        console.log("==================")
    }




})