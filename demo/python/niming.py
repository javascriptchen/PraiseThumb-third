list_x = [1,2,3,4,5,6,7,8]
list_y = [1,4,9,16,25,36,49,64]
f = map(lambda x,y: x*x+y,list_x,list_y)
print(list(f));