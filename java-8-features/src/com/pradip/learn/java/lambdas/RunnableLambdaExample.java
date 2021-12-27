package com.pradip.learn.java.lambdas;

/**
 * @author Pradip
 *
 */
public class RunnableLambdaExample {

	public static void main(String[] args) {

		/**
		 * Prior java 8
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable run method 1 using legacy way");
			}
		};

		new Thread(runnable).start();

		/**
		 * java 8 lambda: ()->{}
		 */

		// 1
		Runnable runnableLamda = () -> {
			System.out.println("Inside runnable run method 1 using Lambda way");
		};
		new Thread(runnableLamda).start();

		// 2 Lambda without Curly Braces when we have single statement in Lambda body
		Runnable runnableLamda2 = () -> System.out.println("Inside runnable run method 2 using Lambda way");
		new Thread(runnableLamda2).start();

		// 3
		new Thread(() -> System.out.println("Inside runnable run method 3 using Lambda way")).start();

		// using legacy way prior java8
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable run method 2 using legacy way");

			}
		}).start();

		// 4 Lambda with Curly Braces when we have multiple statement in Lambda body
		Runnable runnableLamda3 = () -> {
			System.out.println("Inside runnable run method 4 using Lambda way");
			System.out.println("Inside runnable run method 5 using Lambda way");
		};
		new Thread(runnableLamda3).start();
	}
}
