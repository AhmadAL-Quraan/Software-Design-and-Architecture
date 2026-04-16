from typing import Protocol


# Protocol is used for typing only -> telling if class wants to be a Drawable, it must has it's protocol
# must have print_it() method
class Drawable(Protocol):
    def print_it(self) -> None:
        print("Nothing")


class draw1:
    def print_it(self) -> None:
        print("Nothing")


class draw2:
    def print_it(self) -> None:
        print("Nothing2")


def render(shape: Drawable):
    shape.print_it()


if __name__ == "__main__":
    obj1 = draw1()
    obj2 = draw2()
    render(obj1)
    render(obj2)
