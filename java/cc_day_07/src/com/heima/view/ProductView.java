package com.heima.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.heima.domain.Product;
import com.heima.service.ProductService;

public class ProductView {
	public static void main(String[] args) {
		// 1.显示菜单
		System.out.println("欢迎来到商品管理系统,请输入一下命令进行操作:");
		while (true) {
			System.out.println("C:新增  U:修改  D:删除  DA:批量删除   FI:查询  FA:查询所有  Q:退出");
			// 2.获取用户的键盘输入
			Scanner sc = new Scanner(System.in);
			String userSelect = sc.nextLine();
			// 3.判断用户输入的到底是哪一个命令
			switch (userSelect.toUpperCase()) {
			case "C":
				// 新增商品
				addProduct();
				break;
			case "U":
				// 修改商品
				editProduct();
				break;
			case "D":
				// 根据ID删除商品
				deleteProduct();
				break;
			case "DA":
				// 批量删除
				deleteAllProducts();
				break;
			case "FI":
				// 根据id查询
				findById();
				break;
			case "FA":
				// 查询所有商品
				findAll();
				break;
			case "Q":
				System.out.println("欢迎您下次再来哦~~么么哒");
				System.exit(0);// 结束正在运行的JVM
				break;
			default:
				System.out.println("您傻吗?你输得啥玩意...");
				break;
			}
		}
	}

	private static void findAll() {
		System.out.println("您选择了查看所有商品功能!");
		ProductService service = new ProductService();
		List<Product> ps = service.findAll();

		if (ps.isEmpty()) {
			System.out.println("数据库中暂时没有数据，请添加后在查看");
		} else {
			for (Product p : ps) {
				System.out.println(p);
			}
			System.out.println("显示商品成功!");
		}

	}

	private static void findById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了修改商品功能!");
		System.out.println("请输入要查询的商品的编号:");
		int id = Integer.parseInt(sc.nextLine());
		ProductService service = new ProductService();
		Product p = service.findById(id);
		if (p == null) {
			// 如果没有 告诉用户 没有此商品
			System.out.println("查询的商品不存在..请确认后输入...");
		} else {
			System.out.println("您要查询的商品是" + p);
			System.out.println("显示商品成功!");
		}
	}

	private static void deleteAllProducts() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了批量删除商品功能!");
		ProductService service = new ProductService();
		List<Integer> ids = new ArrayList<>();
		while (true) {
			System.out.println("请输入您要删除的商品的编号(-1表示结束):");
			int deleteId = Integer.parseInt(sc.nextLine());
			Product p = service.findById(deleteId);
			if (deleteId == -1) {
				break;
			}
			if (p != null) {
				ids.add(deleteId);
				System.out.println("已经标记此商品..");
			} else {
				System.out.println("此商品不存在,请重新输入");
			}
		}
		if (ids.isEmpty()) {
			System.out.println("批量删除操作已经取消...");

		} else {
			System.out.println("您一共标记了" + ids.size() + "个要删除的商品");
			System.out.println("您确定都要删除吗? y/n");
			String isOrNot = sc.nextLine();
			if ("y".equals(isOrNot)) {
				service.deleteAll(ids);
				System.out.println("批量删除" + ids.size() + "个商品成功!");
			} else {
				System.out.println("取消操作..");
			}
		}

	}

	private static void deleteProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了删除商品功能!");
		System.out.println("请输入要删除的商品编号:");
		int id = Integer.parseInt(sc.nextLine());
		// 判断有没有此id的商品
		ProductService service = new ProductService();
		Product p = service.findById(id);
		if (p == null) {
			System.out.println("查无此商品....");

		} else {
			System.out.println("您要删除的商品信息如下:");
			System.out.println(p);
			System.out.println("您确认要删除吗? y/n");
			String isOrNot = sc.nextLine();
			if ("y".equals(isOrNot)) {
				service.deleteById(id);
				System.out.println("删除商品成功!");
			} else {
				System.out.println("操作取消..");
			}
		}
	}

	private static void editProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了修改商品功能!");
		System.out.println("请输入要修改的商品的编号:");
		int id = Integer.parseInt(sc.nextLine());
		ProductService service = new ProductService();
		Product p = service.findById(id);
		if (p == null) {
			System.out.println("您要修改的商品编号" + id + ",该商品不存在");
		} else {
			System.out.println("您要修改的商品信息如下:");
			System.out.println(p);
			System.out.println("请输入商品的新的名字:");
			String newName = sc.nextLine();
			// 请输入商品的新的价格
			System.out.println("请输入商品的新的价格:");
			int newPrice = Integer.parseInt(sc.nextLine());
			p.setPname(newName);
			p.setPrice(newPrice);
			service.updateProduct(p);
			System.out.println("修改商品成功!");
		}
	}

	private static void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了新增商品功能!");
		System.out.println("请输入商品名字");
		String name = sc.nextLine();
		System.out.println("请输入商品价格");
		int price = Integer.parseInt(sc.nextLine());
		Product p = new Product(name, price);
		ProductService service = new ProductService();
		service.addProduct(p);
	}
}
