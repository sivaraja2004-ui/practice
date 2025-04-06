class Solution(object):
    def romanToInt(self, s):
        roman_values = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50, 
            'C': 100, 'D': 500, 'M': 1000
        }
        
        total = 0
        dk = 0  

        for char in reversed(s):
            curr_value = roman_values[char]
            if curr_value < dk:
                total -= curr_value
            else:
                total += curr_value
            dk = curr_value

        return total
