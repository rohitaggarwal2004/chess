// var fName  = prompt("What's your first name?");

// var lName  = prompt("What's your last  name?");

// var age  = prompt("What's your age?");

// console.log("Usee name is " +fName + " " + lName);
// // console.log( "User age in " + age);

// var num = 10;
// while(num<=40)
// {	
// 	var x = num%2;
// 	if(x==0)
// 	{
// 		console.log(num)
// 	}
// 	num++;
// }

function isEven(num){
	if(typeof  num=== "number")
	{
		if(num%2==0)	
		{
			return "true";
		}
	}
	return "false";
}