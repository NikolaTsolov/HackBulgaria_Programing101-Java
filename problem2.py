import numpy as np

word = input("Enter word: ")


def makeMatrix():
    cols = input("Enter colums: ")
    rows = input("Enter rows: ")
    matrix = []
    temp = []
    cols = int(cols)
    rows = int(rows)
    for row in range(0, rows):
        for col in range(0, cols):
            print("matrix[%d][%d] = " % (row, col))
            element = input()
            temp.append(element)
        matrix.append(temp)
        temp = []

    return matrix


def rowSearch(table, word):
    h = len(table)
    word = word.lower()
    counter = 0
    for x in range(0, h):
        if word in ''.join(table[x]) or word[::-1] in ''.join(table[x]):
            counter += 1
    return counter


def colSearch(table, word):
    w = len(table[0])
    word = word.lower()
    counter = 0
    for index in range(0, w):
        col = [row[index] for row in table]
        if word in ''.join(col) or word[::-1] in ''.join(col):
            counter += 1
    return counter


def diagonalSearch(table, word):

    h = len(table)
    w = len(table[0])

    word = word.lower()
    counter = 0
    table = np.array(table)
    diags = [table[::-1, :].diagonal(i) for i in range(-h + 1, w)]
    diags.extend(table.diagonal(i) for i in range(h - 1, -w, -1))
    temp = [n.tolist() for n in diags]
    for subList in temp:
        if word in ''.join(subList) or word[::-1] in ''.join(subList):
            counter += 1

    return counter


def sumAllWords():
    table = makeMatrix()
    res = rowSearch(table, word) + colSearch(table, word) + \
        diagonalSearch(table, word)
    return res


def main():

    if __name__ == '__main__':
        main()

print("There are {0} {1} in your matrix".format(sumAllWords(), word))
