$(document).ready(init);
function init(){
	$("#btn").on("click",fnHelloWorld);
}
function fnHelloWorld(){
	$("label.hello").text("hellow world");
}