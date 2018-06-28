class CreateGoals < ActiveRecord::Migration[5.1]
  def change
    create_table :goals do |t|
    	t.string :title
      t.text :body
      t.boolean :complete, default: false 
      t.timestamps
    end
  end
end
