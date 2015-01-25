class DifferentStrings:
    def __init__(self, string1, string2):
        self.s1 = string1
        self.s2 = string2
    
    def minimize(self):
        self.count = 0
        if (len(self.s1) != len(self.s2)):
            self.longestStringLength = max(len(self.s1), len(self.s2))
            if(len(self.s1) < len(self.s2)):
                self.numNull = self.longestStringLength - len(self.s1)
                self.s1 = self.s2[0:self.numNull] + self.s1
            else:
                self.numNull = self.longestStringLength - len(self.s2)
                self.s2 = self.s2 + self.s1[len(self.s1) - self.numNull : len(self.s1)]
        
        for i in range(0, len(self.s1)):
            if(self.s1[i] != self.s2[i]):
                self.count = self.count + 1
        
        return self.count

if __name__ == '__main__':
    value = DifferentStrings("mother", "hoodfather")
    print value.minimize()
    

    
    


