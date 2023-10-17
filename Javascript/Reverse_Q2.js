function sortDescending(arr)
 {
    arr.sort((a, b) => b - a);
    return arr;
  }
  
  const input = prompt("Enter numbers:");
  
  if (input)
   {
    const inputArray = input.split(',').map(Number);
  
    if (!inputArray.some(isNaN))
     {
      console.log("Input Array:", inputArray);
  
      const sortedArray = sortDescending(inputArray);
      console.log("Sorted Descending Array:", sortedArray);
    } 
    else
     {
      console.log("Invalid input. Please enter valid numbers separated by commas.");
    }
  } 
  else 
  {
    console.log("No input provided.");
  }
