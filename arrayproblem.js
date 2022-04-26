/*
Example

For n = 5 and a = [4, 0, 1, -2, 3], the output should be solution(n, a) = [4, 5, -1, 2, 1].

b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
So, the resulting array after the mutation will be [4, 5, -1, 2, 1].
/*


function solution(n, a) {
let stack =[];
let firstEle = a[0]+a[1]
 stack.push(firstEle)
let lastEle = a[n-2] + a[n-1]

if(n==1){
    return a;
}
for(let i=1;i<n-1;i++){
    var elements = (a[i-1]) +( a[i]) + (a[i+1]);
    stack.push(elements)
}
    stack.push(lastEle)

return stack;
}

