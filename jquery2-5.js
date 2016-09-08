$("document").ready(init);
function init(){
	$("#fade").on('click',function(){
	$("#myPlugIn").cycle({ fx:'fade'
	});
	});
	
	$("#zoom").on('click',function(){
	$("#myPlugIn").cycle({ fx:'zoom'
	});
	});
	
	$("#curtainX").on('click',function(){
	$("#myPlugIn").cycle({ fx:'curtainX'
	});
	});
	
	$("#turnr").on('click',function(){
	$("#myPlugIn").cycle({ fx:'turnRight'
	});
	});
	
	$("#shuffle").on('click',function(){
	$("#myPlugIn").cycle({ fx:'shuffle'
	});
	});
}