import numpy as np
matrix = np.array([[5, 6, 4],
                  [2, 5, 6],
                  [3, 5, 6]])

U, S, VT = np.linalg.svd(matrix)
print("Matrix U: ")
print(U)
print("Matrix S: ")
print(np.diag(S))
print("Matrix VT: ")
print(VT)

#reconstruct old matrix
recnstrct = np.dot(U,np.dot(np.diag(S),VT))
print("Old Matrix: ")
print(recnstrct)