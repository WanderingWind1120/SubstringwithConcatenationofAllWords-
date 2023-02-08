# SubstringwithConcatenationofAllWords-
Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
The output order does not matter. Returning [9,0] is fine too.

Cho một String và một array gồm các string có độ dài bằng nhau 
Kiểm tra xem trong String có hay không các hoán vị của các string trong array đã cho và đưa ra vị trí xuất phất của từng hoán vị đó trong một List<Integer>
