/**
 * Created by Administrator on 2016-11-11.
 */
function searchArticle(){
    $.ajax({
        data:"keywords="+$("#keywords").val(),
        type:"GET",
        dataType: 'json',
        url:"/getArticles.do",
        error:function(data){
            alert("出错了！！:"+data.msg);
        },
        success:function(data){
            alert("success:"+data.msg);
            $("#result").html(data.msg) ;
        }
    });
}