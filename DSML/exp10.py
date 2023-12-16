import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score

data=pd.read_csv('Salary_Data.csv')

x=data['YearsExperience'].values.reshape(-1,1)
y=data['Salary'].values

x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.2,random_state=42)
LR=LinearRegression()
LR.fit(x_train,y_train)
D=LR.predict(x_test)
r2 = r2_score(y_test, D)
print("R2 Score: ", r2)

plt.scatter(x_test,y_test,color='black',label='Data Points')
plt.plot(x_test,D,color='blue', linewidth=3,label='Regression Line')
plt.xlabel='YearsExperience'
plt.ylabel='Salary'
plt.legend()
plt.show()






# result=accuracy_score(y_test,D)
# print("Accuracy= ",result)
# cr=classification_report(y_test,D)
# print("Classification Report: ",cr)
# Use mean squared error (MSE) as the metric
# mse = mean_squared_error(y_test, D)
# print("Mean Squared Error: ", mse)

