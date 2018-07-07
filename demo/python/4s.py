class CarStore(object):
    def __init__(self):
        pass

    def order(self):
        pass


class Car(object):
    def move(self):
        print("车在移动")

    def stop(self):
        print("车停止了")

    def music(self):
        print("车在放歌")


car_store = CarStore()

car = car_store.order(100000)
car.move()
car.stop()
car.music()
