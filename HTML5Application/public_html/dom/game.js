var count = 5;
var stop = false;
var background = "white";
document.querySelector("#button1").addEventListener("click",click1);
document.getElementById("button2").addEventListener("click",click2);
document.querySelector("#reset").addEventListener("click",reset);
document.querySelector("#name").addEventListener("change",blur1);

function click1()
{	
	_click("#span1");
}

function click2()
{	
	_click("#span2");
}

function _click(id)
{	
	var span = document.querySelector(id);
	if(Number(span.textContent) <count && stop ==false)
	{
		span.textContent = Number(span.textContent) +1;	
		if(Number(span.textContent) == count)
		{
			stop=true;
			span.classList.add("winner");
		}
	}
}


function reset()
{	
	document.getElementById("span1").textContent = Number(0);
	document.getElementById("span2").textContent = Number(0);
	document.querySelector("#span1").classList.remove("winner");
	document.querySelector("#span2").classList.remove("winner");
	stop = false;
	background = "white";
}

function blur1()
{	
	reset();
	count =Number(document.getElementById("name").value);
	document.getElementById("span3").textContent = count;

}
