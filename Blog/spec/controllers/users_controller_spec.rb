require 'rails_helper'

describe UsersController do 
	describe "#new" do 
		it "responds with a 200" do 
			get :new
			expect(response.status).to eq 200 
		end 
	end 

	describe "#index" do 
		it "should get new template" do 
			get :new
		end 
	end 
end 