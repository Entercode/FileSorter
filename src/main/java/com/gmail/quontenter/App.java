package com.gmail.quontenter;

public class App {

	public static void main(String[] args) {
		FolderObserver fobserver = new FolderObserver("/User/rituaerial/Downloads");
		fobserver.observe();
	}

}
