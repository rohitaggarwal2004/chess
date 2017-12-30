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
    var length = arr.length;
	if(length>1)
	{
		
		for(var i=0;i<arr.length-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				return false;

			}
		}
		return true;
	}
}

function sunArray(arr)
{
}

function max(arr)
{

	var length = arr.length;
	if(length>1)
	{
		var max = arr[0];
	
		for(var i=1;i<arr.length;i++)
		{
			if(max <arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
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

