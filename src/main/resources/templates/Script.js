
function clickbutton(){
    document.querySelector("#signin").click();
}

function verifica(){

    var pas=document.getElementById("senha").value;
    var pas2=document.getElementById("senha2").value;
    if(pas!=pas2){
        alert("senhas diferentes");
    }
}

$(document).ready(()=>{
            
    $("#signin").click(()=>{
        $("#form").show();
        $("#form2").hide();               
    });

    $("#signup").click(()=>{
        $("#form").hide();
        $("#form2").show();               
    });

})
