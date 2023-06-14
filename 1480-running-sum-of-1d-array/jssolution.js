let nums = [1,2,3,4]
  //expected Output: [1,3,6,10]
 let temp=0
    for(let i=0; i<nums.length;i++){
       
        temp= temp+ nums[i]
        nums[i]=temp
         console.log(nums) 
    }

 
