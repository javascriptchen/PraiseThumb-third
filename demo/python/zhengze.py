import re

s = 'life is short,i use python,i love python'
r = re.findall('life(.*)python',s)
print(r[0])