class Solution(object):
    def isPalindrome(self, s):
        str=""
        for i in s:
            if(i.isalnum()):
                str+=i.lower()
        str1 = str[::-1]
        if(str1== str):
             return(True)
        else:
            return(False)
        