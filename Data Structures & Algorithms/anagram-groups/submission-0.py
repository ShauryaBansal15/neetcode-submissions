class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result_dictionary = defaultdict(list)

        for s in strs:
            count = [0] * 26 # a-z counter 

            for c in s:
                count[ord(c) - ord("a")] += 1
            
            result_dictionary[tuple(count)].append(s)
        
        return list(result_dictionary.values())