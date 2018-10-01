package com.heima.view;

import java.util.List;
import java.util.Scanner;

import com.heima.domain.Product;
import com.heima.service.ProductService;

public class ProductView {

	public static void main(String[] args) {
		System.out.println("欢迎来到商品管理系统,请输入一下命令进行操作:");
		while (true) {
			System.out.println("C:新增  U:修改  D:删除  DA:批量删除   FI:查询  FA:查询所有  Q:退出");
			Scanner sc = new Scanner(System.in);
			String userSelect = sc.nextLine();
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
				System.exit(0);
				break;
			default:
				System.out.println("您傻吗?你输得啥玩意...");
				break;
			}
		}
	}

	private static void findAll() {
		System.out.println("您选择了查询所有数据功能");
		ProductService service = new ProductService();
		List<Product> ps = service.findAll();
		if (ps.isEmpty()) {
			System.out.println("数据库中暂时没有数据,亲添加后再查看哟~~~");
		} else {
			for (Product p : ps) {
				System.out.println(p);
			}
			System.out.println("所有商品显示完毕!");
		}
	}

	private static void findById() {
		System.out.println("您选择了根据id查询数据功能");
		System.out.println("请输入您要查询的id");
		Scanner sc = new Scanner(System.in);
		int id = Integer.parseInt(sc.nextLine());
		ProductService service = new ProductService();
		Product p = service.findById(id);
		if (p == null) {
			System.out.println("查询的商品不存在..请确认后输入...");
		} else {
			System.out.println("您要查询的商品是" + p);
			System.out.println("显示商品成功!");
		}
	}

	private static void deleteAllProducts() {
		System.out.println("您选择了删除所有数据功能");
	}

	private static void deleteProduct() {
		Scanner sc = new Scanner(System.in);
		ProductService service = new ProductService();
		System.out.println("您选择了删除数据功能");
		System.out.println("请输入您需要删除的商品id");
		int id = Integer.parseInt(sc.nextLine());
		Product p = service.findById(id);
		if(p == null) {
			System.out.println("查无此商品....");
		}else {
			System.out.println("您要删除的商品信息如下:");
			System.out.println(p);
			System.out.println("您确认要删除吗? y/n");
			String deleteOrNot = sc.nextLine();
			if("y".equals(deleteOrNot)) {
				
				service.deleteProduct(id);
				System.out.println("删除商品成功!");

			}else {
				System.out.println("操作取消..");
			}
			
		}
		
	}

	private static void editProduct() {
		ProductService service = new ProductService();
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了修改数据功能");
		System.out.println("请输入您要修改的商品id");
		int id = Integer.parseInt(sc.nextLine());
		Product p = service.findById(id);
		if (p == null) {
			System.out.println("您要修改的商品id" + id + "不存在");
		} else {
			System.out.println("您要修改的商品信息如下:");
			System.out.println(p);
			System.out.println("请输入您要修改的商品名称");
			String name = sc.nextLine();
			System.out.println("请输入您要修改的商品价格");
			int price = Integer.parseInt(sc.nextLine());
			p.setPid(id);
			p.setPname(name);
			p.setPrice(price);
			service.editProduct(p);
			System.out.println("修改商品成功!");
		}

	}

	private static void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("您选择了增加数据功能");
		System.out.println("请输入新的商品名字:");
		String name = sc.nextLine();
		System.out.println("请输入新的商品价格:");
		int price = Integer.parseInt(sc.nextLine());
		Product p = new Product(name,price);
		ProductService service = new ProductService();
		service.addProduct(p);
		System.out.println("添加商品成功!");

	}

}
