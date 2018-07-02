require 'rails_helper'

describe PostsController do 
	describe "#index" do 
		it "responds with a 302" do 
			get :index
			expect(response.status).to eq 302 
		end 
	end 

	describe "#index" do 
		it "should be the index" do 
			get :index
		end 
	end 

	describe "#index" do 
		it "displays all the posts" do 
			post = Post.create(title: "new post", body: "content")

			get :index

			expect(assigns(:post)).to have(1).post
		end 
	end 

	describe "#index" do 
		it "renders the index template" do 
			get :index
			expect(response).to redirect_to(:login)
		end 
	end 
end 