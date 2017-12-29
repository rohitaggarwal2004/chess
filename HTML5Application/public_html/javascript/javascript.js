function kebabToStar(str)
{
    str.replace("-", "_");
    return str;
}


function isFactorialRecursive(num)
{
    if (typeof num == "number" && num > 0)
    {
        return num * isFactorialRecursive(--num);
    } else
    {
        return 1;
    }
}

function arryNumbersAlert(arr, func)
{
for(var i=arr.length-1;i>=0;i--)
	{
		alert(arr[i]);
	}	
}
function printReverse(arr)
{
	for(var i=arr.length-1;i>=0;i--)
	{
		console.log(arr[i]);
	}
 
}

function printAtConsole()
{
	console.log("*****************");
	console.log("Hello , How are you doing...")
	console.log("*****************");
}

function isUniform(arr)
{
}

function sunArray(arr)
{
}

function max(arr)
{
}


function isEven(num) {
    if (typeof num === "number")
    {
        if (num % 2 == 0)
        {
            return true;
        }
    }
    return false;
}

function isFactorial(num)
{
    if (typeof num == "number" && num > 0)
    {
        var x = 1;
        while (num >= 1)
        {
            x *= num;
            num--;
        }
        return x;
    }
}

