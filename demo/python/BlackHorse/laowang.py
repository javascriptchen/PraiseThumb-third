class Person(object):
    """"人的类"""

    def __init__(self, name):
        super(Person, self).__init__()  # 调用父类的__init__方法
        self.name = name


class Gun(object):
    """"枪的类"""

    def __init__(self, name):
        super(Gun, self).__init__()  # 调用父类的__init__方法
        self.name = name


def main():
    """"用来控制整个程序的流程"""
    # 1.创建一个老王对象
    laowang = Person("老王")
    # 2.创建枪对象
    gun = Gun("ak47")
    # 3.创建弹夹对象

    # 4.创建子弹对象

    # 5.老王把子弹安装到弹夹中

    # 6.老王把弹夹安装到枪中

    # 7.老王拿枪

    # 8.创建一个敌人

    # 9.老王开枪打敌人


if __name__ == "__main__":
    main()
