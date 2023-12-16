from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.metrics import accuracy_score, classification_report
import numpy as np

iris = load_iris()
x = iris.data
y = iris.target
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)
dt = DecisionTreeClassifier(max_depth=3)
dt.fit(x_train, y_train)

D = dt.predict(x_test)
result = accuracy_score(y_test, D)
cr = classification_report(y_test, D)

print("Accuracy= ", result)
print("Classification Report: ", cr)

new_data = np.array([5.1, 3.5, 1.4, 0.2]).reshape(1, -1)
new_predictions = dt.predict(new_data)
predicted_category = iris.target_names[new_predictions[0]]
print(predicted_category)
