To run the program:
1. cd into the directory that has the build.xml file (folder staticJDBLisp)
2. type in java -jar dist/JCLisp-0.2.0.jar 
3. Enter test code
4. To exit testing type in (quit)


To access javacc files:
cd staticJDBLisp/src/edu/utexas/cs345/jdblisp


Test Code:

(equals ‘(1 3))

(equals ‘(a a))

(equals ‘((1 2)(1 3)))

(list? ‘(1 2))

(list? 6)

(list? ‘a)

(atom? ‘a)

(atom? 23)

(num? 2)

(num? ‘(2 3))

(num? ‘k)

(num? (/9))

(last ‘(z y m 1)) 


(let ((z 17)) (let ((z 3) (a 5) (x (lambda (x y) (- x (+ y z))))) (let ((z 19) (a 5)) (funcall x z a))))  

(let ((z 3) (a 5) (x (lambda (x y) (- x (+ y z))))) (let ((z 19) (a 5)) (funcall x z a))) 

(let ((z 20)) (let ((z 3) (a 5) (x (lambda (x y) (- x (+ y z))))) (let ((z 10) (a 5)) (funcall x z a)))) 

(let ((z 20)) (let ((z 3) (a 5) (x (lambda (x y) (x (+ y z))))) (let ((z 10) (a 5)) (funcall x z a)))) 