/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length!=t.length)
    {
        return false;
    }
  let var1=s.split("");
  let var2=t.split("");
  var1.sort();
  var2.sort();
  for(let i=0;i<s.length;i++)
  {
    if(var1[i]!=var2[i])
    {
        return false;
    }
  }
  return true;
    
};