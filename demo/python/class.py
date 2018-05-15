
class Student():
    name = '' 
    age = 0
    num = 0
    def __init__(self,name,age):
        self.name = name
        self.age = age
        self.__class__.num += 1
        print(self.__class__.num)
    def print_file(self):
        print('name: ' +self.name)
        print('age: '+ str(self.age))

student1 = Student('123',12)
student2 = Student('123',12)
student3 = Student('123',12)

student1.print_file()

print(student1.__dict__)