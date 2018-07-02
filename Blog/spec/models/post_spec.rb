require 'rails_helper'

describe "Post" do
  it 'should have a title' do 
  	p = Post.create(:title => "my title")
  	expect(p.title).to eq("my title")
  end 

  it 'should have content' do 
  	p = Post.create(:body => "my cat gifs")

  	expect(p.body).to eq("my cat gifs")
  end 
end
