import numpy as np
def input_matrix(ourmatrix):
    r = int(input(f"Enter the no of rows for {ourmatrix}:"))
    c = int(input(f"Enter the no of columns for {ourmatrix}:"))
    matrix=[]
    print("Enter the elements:")
    for i in range(r):
        r=[]
        for j in range(c):
            elements=int(input(f"enter the element at row{i+1},colomn{j+1}"))
            r.append(elements)
            matrix.append(r)
    return np.array(matrix)
matrix1=input_matrix("matrix1")
input_matrix(matrix1)
matrix2=input_matrix("matrix2")
input_matrix(matrix2)
